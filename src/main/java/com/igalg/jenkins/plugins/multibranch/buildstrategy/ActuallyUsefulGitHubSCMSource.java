package com.igalg.jenkins.plugins.multibranch.buildstrategy;

import java.io.IOException;

import hudson.model.TaskListener;
import jenkins.scm.api.SCMHead;
import jenkins.scm.api.SCMRevision;

import org.jenkinsci.plugins.github_branch_source.GitHubSCMSource;


public class ActuallyUsefulGitHubSCMSource extends GitHubSCMSource {

  public ActuallyUsefulGitHubSCMSource(String id, String apiUri, String checkoutCredentialsId, String scanCredentialsId, String repoOwner, String repository) {
    super(id, apiUri, checkoutCredentialsId, scanCredentialsId, repoOwner, repository);
  }

  SCMRevision getCommitHash(SCMHead head, TaskListener listener) throws IOException, InterruptedException {
    return super.retrieve(head, listener);
  }
}
