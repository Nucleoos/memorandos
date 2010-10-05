

class Message {

    User sender
    def receiver = [receiver: User]
    String subject
    String content
    def annexes = []

    // pegar do sistema
    Date date = new Date()



    static constraints = {
        receiver(blank:false)
        subject(blank: false)
        content(blank: false)
        
    }

   
          
}
