pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'mvn -V -B clean verify site'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/TEST-*.xml'
            recordIssues tools: [
                checkStyle(pattern: 'target/checkstyle-result.xml'),
                spotBugs(pattern: 'target/spotbugsXml.xml')
            ]
            recordCoverage(tools: [[parser: 'JACOCO']],
                id: 'jacoco', name: 'JaCoCo Coverage')
        }
    }
}
