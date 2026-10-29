// def call(){
//   dependencyCheck additionalArguments: '--scan ./', odcInstallation: 'OWASP'
//   dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
// }
def call() {
  dependencyCheck(
    additionalArguments: '--scan ./',
    odcInstallation: 'OWASP',
    nvdCredentialsId: 'nvd-api-key'
  )
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
