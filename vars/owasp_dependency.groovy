def call(){
  dependencyCheck additionalArguments: '--scan ./', odcInstallation: 'OWASP', nvdCredentialsId: 'nvd-api-key'
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
