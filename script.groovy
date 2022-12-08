def pushToNexus() {
    echo "pushing the jar file to Nexus maven-snapshots repo..."
    sh 'mvn clean package -D maven.test.skip=true deploy'
}

def sonarScan() {
    echo "Running sonarQube scan..."
    //sh 'mvn test'
    sh 'mvn sonar:sonar -D maven.test.skip=true -D sonar.projectKey=devops-project -D sonar.host.url=http://172.18.0.4:9000 -D sonar.login=sqp_3c04da6ccdef164d7564e419573a13f984fa49bb'
     \
   \
}

return this
