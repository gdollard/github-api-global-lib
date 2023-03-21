def sayHello(Map config = [:]) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}

def scanStuff(Map config = [:]) {
    def msg = config.message ? config.message : 'Scanning without label....'
    keepPrivate()
     echo msg
     if (config.dirToScan) {
        if (fileExists(config.dirToScan)) {
            echo 'File found!'
        } else {
            echo 'File not found!'
        }
    } else {
        echo 'No dir passed, nothing to scan!'
    }
}

private def keepPrivate() {
    echo 'Something Private'
}