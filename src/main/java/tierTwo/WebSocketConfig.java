package tierTwo;

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
