package hello.login.web.session;

import hello.login.domain.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

class SessionManagerTest {

    SessionManager sessionManager = new SessionManager();

    @Test
    void sessionTest(){
        // given
        MockHttpServletResponse response = new MockHttpServletResponse();
        Member member = new Member();
        sessionManager.createSession(member, response);

        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setCookies(response.getCookies()); // mySessionId=123123

        // when
        Object result = sessionManager.getSession(request);

        // then
        Assertions.assertThat(result).isEqualTo(member);

        // when
        sessionManager.expire(request);
        Object expired = sessionManager.getSession(request);

        // then
        Assertions.assertThat(expired).isNull();
    }
}