package memorandosonline

class MensagemController {

    User toUser
    String subject
    String nota
    Date dateSend = new Date()

    def hasMany = [mensagem:Mensagem]
}
