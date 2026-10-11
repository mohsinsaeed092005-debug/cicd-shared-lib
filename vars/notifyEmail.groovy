def call(String status, String to) {
    try {
        mail to: to,
             subject: "[${env.BRANCH_NAME}] ${status}: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
             body: "Pipeline ${status}\nBranch/Tag: ${env.BRANCH_NAME}\nBuild: ${env.BUILD_URL}"
    } catch (err) {
        echo "Email not sent (SMTP not configured yet): ${err.getMessage()}"
    }
}
