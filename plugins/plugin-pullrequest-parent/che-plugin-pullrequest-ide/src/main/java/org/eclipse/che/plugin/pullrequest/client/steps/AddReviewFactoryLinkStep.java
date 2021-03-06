/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.plugin.pullrequest.client.steps;

import com.google.inject.Singleton;
import org.eclipse.che.plugin.pullrequest.client.workflow.Context;
import org.eclipse.che.plugin.pullrequest.client.workflow.Step;
import org.eclipse.che.plugin.pullrequest.client.workflow.WorkflowExecutor;
import org.eclipse.che.plugin.pullrequest.shared.dto.Configuration;

/**
 * Adds a factory link to the contribution comment.
 *
 * @author Kevin Pollet
 */
@Singleton
public class AddReviewFactoryLinkStep implements Step {

  @Override
  public void execute(final WorkflowExecutor executor, final Context context) {
    final String reviewFactoryUrl = context.getReviewFactoryUrl();
    final Configuration contributionConfiguration = context.getConfiguration();
    final String formattedReviewFactoryUrl =
        context.getVcsHostingService().formatReviewFactoryUrl(reviewFactoryUrl);
    final String contributionCommentWithReviewFactoryUrl =
        formattedReviewFactoryUrl + "\n\n" + contributionConfiguration.getContributionComment();
    contributionConfiguration.withContributionComment(contributionCommentWithReviewFactoryUrl);

    executor.done(this, context);
  }
}
