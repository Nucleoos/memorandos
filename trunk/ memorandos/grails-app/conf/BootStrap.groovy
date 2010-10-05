class BootStrap {

    def authenticateService
    def init = { servletContext ->

        development{
                def role_admin = new Role(description: "Usuário administrador", authority: "ROLE_ADMIN")
                role_admin.save()
                def pass_admin = authenticateService.encodePassword("123456")
                def user_admin = new User(username:"Claudia", userRealName:"Claudia Stevam", passwd:pass_admin, enabled:true, email: "claudiastevam@gmail.com", emailShow:true,description: "Usuário administrador do sistema!"  )
                user_admin.addToAuthorities(role_admin)
                user_admin.save()


                def role_user = new Role(description: "Usuário simples", authority: "ROLE_USER")
                role_user.save()
                def pass_user = authenticateService.encodePassword("123456")
                def user_user = new User(username:"Jose", userRealName:"jose Matias", passwd:pass_user, enabled:true, email: "claudiastevam@gmail.com", emailShow:true,description: "Usuário simples do sistema!"  )
                user_user.addToAuthorities(role_user)
                user_user.save()

            //def requestmap1 = new Requestmap(url:"/**",configAttribute:"IS_AUTHENTICATED_ANONYMOUSLY").save()
            //def requestmap2 = new Requestmap(url:"/login/**",configAttribute:"IS_AUTHENTICATED_ANONYMOUSLY").save()
             // new Requestmap(url:"/",configAttribute:"ADMIN, NORMAL").save()// ativa o login como pag principal
               // new Requestmap(url:"/login/**",configAttribute:"ADMIN").save()
              // new Requestmap(url:"/login/index",configAttribute:"ADMIN").save()
               // new Requestmap(url:"/login/openIdAuthenticate",configAttribute:"ADMIN").save()

               // def requestmap3 = new Requestmap(url:"/user/**",configAttribute:"ADMIN").save()
               // def requestmap4 = new Requestmap(url:"/role/**",configAttribute:"ADMIN").save()
                //def requestmap5 = new Requestmap(url:"/secure/**",configAttribute:"ADMIN").save()

        }
    }
    def destroy = {
    }
}
