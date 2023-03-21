def sayHello(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}

def saySomehingElse(message) {
    def msg = message ? message : "Nada to say!"
    sh "echo ${msg}"
}