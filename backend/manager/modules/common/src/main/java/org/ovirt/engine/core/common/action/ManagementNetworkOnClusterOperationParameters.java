package org.ovirt.engine.core.common.action;

import org.ovirt.engine.core.common.businessentities.Cluster;
import org.ovirt.engine.core.compat.Guid;

public class ManagementNetworkOnClusterOperationParameters extends ClusterOperationParameters {

    private static final long serialVersionUID = 1L;

    private Guid managementNetworkId;

    private boolean updateCpuFlags;

    public ManagementNetworkOnClusterOperationParameters(Cluster cluster) {
        this(cluster, null);
    }

    public ManagementNetworkOnClusterOperationParameters(Cluster cluster, Guid managementNetworkId) {
        super(cluster);
        this.managementNetworkId = managementNetworkId;
    }

    public Guid getManagementNetworkId() {
        return managementNetworkId;
    }

    public void setManagementNetworkId(Guid managementNetworkId) {
        this.managementNetworkId = managementNetworkId;
    }

    public boolean isUpdateCpuFlags() {
        return updateCpuFlags;
    }

    public void setUpdateCpuFlags(boolean updateCpuFlags) {
        this.updateCpuFlags = updateCpuFlags;
    }

    public ManagementNetworkOnClusterOperationParameters() {
    }
}
