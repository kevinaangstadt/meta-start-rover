SUMMARY = "Python API for communication and control of SITL over MAVLink."
HOMEPAGE = "http://python.dronekit.io"

LICENSE = "Apache"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=1ac72017f1a6fdc78b52aecc9fbee6d0"

SRC_URI = "https://files.pythonhosted.org/packages/d2/ff/967e87ac5ac09cea5cdb5bbca5b48a24f695d6e583deb26f7ecf491fb884/dronekit_sitl-${PV}.tar.gz"
SRC_URI[md5sum] = "6966ef3df178bff5550246915a861380"

S = "${WORKDIR}/dronekit_sitl-${PV}"

inherit setuptools
