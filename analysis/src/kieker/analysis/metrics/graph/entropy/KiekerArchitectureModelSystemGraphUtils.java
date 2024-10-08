/***************************************************************************
 * Copyright 2022 Kieker Project (http://kieker-monitoring.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package kieker.analysis.metrics.graph.entropy;

import org.mosim.refactorlizar.architecture.evaluation.graphs.Node;
import org.mosim.refactorlizar.architecture.evaluation.graphs.SystemGraphUtils;

import com.google.common.graph.Graph;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableGraph;

import kieker.model.analysismodel.deployment.DeployedComponent;
import kieker.model.analysismodel.deployment.DeployedOperation;

/**
 * Utility class to generate a system graph for Kieker Deployment Models.
 *
 * @author Reiner Jung
 * @since 2.0.0
 */
public class KiekerArchitectureModelSystemGraphUtils implements SystemGraphUtils<DeployedComponent> {

	@Override
	public MutableGraph<Node<DeployedComponent>> convertToSystemGraph(final Graph<Node<DeployedComponent>> graph) {
		final MutableGraph<Node<DeployedComponent>> systemGraph = Graphs.copyOf(graph);

		final DeployedOperation method = null;

		systemGraph.addNode(new KiekerNode<>(method));
		return systemGraph;
	}

}
