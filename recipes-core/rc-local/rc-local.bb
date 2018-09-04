DESCRIPTION = "rc.local to set nameservers for start image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=19fc83a52fd597b2ed4f11ed3c83a324"

SRC_URI = "file://rc.local.etc \
           file://rc.local.init \
           file://LICENSE"

S = "${WORKDIR}"

inherit update-rc.d

INITSCRIPT_NAME = "rc.local"
INITSCRIPT_PARAMS = "defaults 99"

do_install () {
    install -d ${D}/${sysconfdir}/init.d
    install -m 755 ${S}/rc.local.etc ${D}/${sysconfdir}/rc.local
    install -m 755 ${S}/rc.local.init ${D}/${sysconfdir}/init.d/rc.local

}