SUMMARY = "Set IP addresses for Locomotion Controller"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=ceee2c4dcbb73620de8c97aa99092555"
SRC_URI = "file://interfaces-locomotion \
           file://resolv.conf \
           file://LICENSE"

S = "${WORKDIR}"

do_install () {
	install -D -m 0644 ${WORKDIR}/interfaces-locomotion ${D}${sysconfdir}/network/interfaces
    install -m 0644 ${WORKDIR}/resolv.conf ${D}${sysconfdir}
}

RDEPENDS_${PN} = "init-ifupdown"

CONFFILES_${PN} = "${sysconfdir}/network/interfaces"
