def sayHello(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}

def saySomethingElse(message="Nothing to say!") {
    sh "echo ${message}"
}