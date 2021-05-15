package tierTwo;

import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketTransportRegistration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSocketsMessageBroker
public class WebSocketConfig implements WebSocketsMessageBrokerConfigurer
{
  public void configureMessageBroker(MessageBrokerRegistry configure)
  {
    configure.enableSimpleBroker("/");
    configure.setApplicationDestinationPrefixes("/");
  }

  public void registerStompEndpoints(StompEndpointsRegistry registry)
  {
    registry.addEndpoint("/").setAllowedOrigins("*").withSockJS();
  }

  public void configureWebSocketTransport(WebSocketTransportRegistration registration)
  {
    registration.setMessageSizeLimit(1024*1024);
    registration.setSendBufferSizeLimit(1024*1024);
  }
}
