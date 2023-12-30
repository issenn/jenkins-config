#!groovy

import jenkins.model.Jenkins

// Recommended to not run builds on the built-in node
// Jenkins.instance.numExecutors = 0
// Jenkins.get().setNumExecutors(0)
Jenkins.get().numExecutors = 0
