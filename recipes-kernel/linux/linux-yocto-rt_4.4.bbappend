FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

PR := "${PR}.7"

COMPATIBLE_MACHINE_up-board = "up-board"


KERNEL_FEATURES_append_up-board += " cfg/smp.scc"

# aufs is needed for the live-boot feature
KERNEL_FEATURES_append_up-board += "${@bb.utils.contains('DISTRO_FEATURES', 'aufs', ' features/aufs/aufs-disable.scc', '', d)}"

SRC_URI += "file://up-board-preempt-rt.scc \
            file://up-board-user-config.scc \
            file://up-board-user-patches.scc \
            file://up-board-user-features.scc \
            file://0001-enable-spidev1.patch \
            file://ebtables.scc \
            file://lxc.scc \
            file://docker.scc \
            "

KERNEL_MODULE_AUTOLOAD += "xt_conntrack"
KERNEL_MODULE_AUTOLOAD += "xt_addrtype"