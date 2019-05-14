package application.model;


public class Message  {
    public Integer messageId;
    public String message;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


@PostConstruct
    public void afterPropertiesSet()throws Exception{
        System.out.println("Bean is in init process");
    }

@PreDestroy
    public void destroy()throws Exception{
        System.out.println("Bean is destroyed");
    }
}
