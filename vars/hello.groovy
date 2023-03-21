def sayHello(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}

def scanStuff(Map config = [:]) {
    config.message ? echo '${config.message}' : echo 'Scanning...'
    if( fileExists(config.dirToScan)) {
        echo 'File found!'
    } else {
        echo 'File not found!'
    }
}