//package uk.fratcliffe.fl2j.config;
//
//import org.apache.catalina.connector.Connector;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class TomcatConfiguration {
//    private Connector redirectConnector() {
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setScheme("http");
//        connector.setPort(8080);
//        connector.setSecure(false);
//        connector.setRedirectPort(8443);
//        return connector;
//    }
//}
