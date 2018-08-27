SUMMARY = "Pure Python implementation of the I2C SMBus protocol."
HOMEPAGE = "https://github.com/bjornt/pysmbus"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=68447e693bbf323496175ec91ce05a67"

SRC_URI[md5sum] = "68dff2068e0ea1dc5ae61069af5eb4e8"

PYPI_PACKAGE = "pysmbus"



inherit pypi
inherit setuptools

# the directory structure is a bit weird
S = "${WORKDIR}/pysmbus-0.1"

BBCLASSEXTEND = "native nativesdk"