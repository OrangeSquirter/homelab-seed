pipelineJob('template-creator') {
    displayName('Template Creator')
    description('Generate ProxMox templates')

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/OrangeSquirter/homelab-seed.git')
                    }
                    branch('master')
                }
            }
            scriptPath('pipelines/template-creator/Jenkinsfile')
        }
    }
}
