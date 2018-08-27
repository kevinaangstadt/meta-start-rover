DESCRIPTION = "Image with everything needed to run TRMO START scenarios on \
APMrover2 based platform."

DISTRO_FEATURES_append = " systemd aufs x11"

VIRTUAL-RUNTIME_init_manager = "systemd"

DISTRO_FEATURES_BACKFILL_CONSIDERED = "sysvinit"

VIRTUAL-RUNTIME_initscripts = "systemd-compat-units"

IMAGE_FEATURES += "x11-base ssh-server-dropbear hwcodecs dev-pkgs tools-sdk \
	tools-debug tools-profile tools-testapps debug-tweaks ssh-server-openssh \
    package-management"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL += "kernel-devsrc openjre-8 git git-perltools python-pip \
    linux-firmware wireless-tools wpa-supplicant smartpm i2c-tools \
		python-psutil screen tmux"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "kernel-module-xt-conntrack kernel-module-nf-nat kernel-module-xt-addrtype"


export IMAGE_BASENAME = "meta-start-rover"
