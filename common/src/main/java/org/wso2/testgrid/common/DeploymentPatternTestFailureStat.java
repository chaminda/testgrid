/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.testgrid.common;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by harshan on 12/21/17.
 */
@Entity
public class DeploymentPatternTestFailureStat {

    @Id
    private String deploymentPatternId;
    private Integer failureCount;

    public String getDeploymentPatternId() {
        return deploymentPatternId;
    }

    public void setDeploymentPatternId(String deploymentPatternId) {
        this.deploymentPatternId = deploymentPatternId;
    }

    public Integer getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
    }
}