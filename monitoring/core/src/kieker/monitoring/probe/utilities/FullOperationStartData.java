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

package kieker.monitoring.probe.utilities;

/**
 * Stores the *full* data of an operation start, to later on produce an execution record
 * 
 * @author Lubomir Bulej, David Georg Reichelt
 */
public final class FullOperationStartData extends OperationStartData {

	private final String operationSignature;

	public FullOperationStartData(final boolean entrypoint, final long traceId, final long tin, final int eoi, final int ess, final String signature) {
		super(entrypoint, traceId, tin, eoi, ess);
		this.operationSignature = signature;
	}

	public String getOperationSignature() {
		return operationSignature;
	}

}
