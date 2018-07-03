FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://main.conf"

do_install_append () {
	#Blacklist ethn and wlan network interfaces
	if test -e ${WORKDIR}/main.conf; then
		install -d ${D}${sysconfdir}/connman
		install -m 0644 ${WORKDIR}/main.conf ${D}${sysconfdir}/connman
	fi
}
