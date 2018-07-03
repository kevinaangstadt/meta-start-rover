require meta-start-rover.bb

DESCRIPTION = "An image with the network configuration for the locomotion controller."

IMAGE_INSTALL += " interfaces-locomotion"

export IMAGE_BASENAME = "meta-start-rover-locomotion"
