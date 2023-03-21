def sayHello(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}

def saySomehingElse(message="Nothing to say!") {
    sh "echo ${message}"
}