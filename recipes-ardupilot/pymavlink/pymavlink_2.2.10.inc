SUMMARY = "Python MAVLink code"
HOMEPAGE = "https://github.com/ArduPilot/pymavlink/"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=5fd62fd863480ab5dee8de556d91d1b8"

SRC_URI[md5sum] = "ff4b37fab00917450a9e2b00f30050ec"

PYPI_PACKAGE = "pymavlink"

inherit pypi

BBCLASSEXTEND = "native nativesdk"