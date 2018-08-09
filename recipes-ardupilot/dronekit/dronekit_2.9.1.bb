SUMMARY = "Python API for communication and control of drones over MAVLink."
HOMEPAGE = "http://python.dronekit.io"

LICENSE = "Apache"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=8c65c3e5442107385997f69194de499b"

SRC_URI = "https://files.pythonhosted.org/packages/59/7d/d5ecb8151be29234ffc2eb49c2afb2ca1db9c9307e2ef3e9c1b81c6e57f9/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "eaaba29e14c5b5e6e86bca116d4df475"

S = "${WORKDIR}/${PN}-${PV}"

inherit setuptools
