require meta-start-rover.bb

DESCRIPTION = "An image with the network configuration for the trusted controller."

IMAGE_INSTALL += " interfaces-trusted docker xterm python3 python3-pip \
                   python-mavlink python3-enum python3-numpy python3-pymavlink \
                   python-dronekit python3-dronekit dronekit-sitl \
                   python-pysmbus"

export IMAGE_BASENAME = "meta-start-rover-trusted"
