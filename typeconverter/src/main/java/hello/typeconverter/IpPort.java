package hello.typeconverter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.format.annotation.NumberFormat;

@Getter
@EqualsAndHashCode
public class IpPort {
    private String ip;
    @NumberFormat(pattern = "###,###")
    private int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
}
