SUMMARY = "Cross-platform lib for process and system monitoring in Python."
HOMEPAGE = "https://github.com/bjornt/pysmbus"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=05e8b996a3acdc6eea9459c4e2c24d61"

SRC_URI[md5sum] = "434cd8f9a1fdc93ce7903fdc9b5e3906"

PYPI_PACKAGE = "psutil"

inherit pypi
inherit setuptools


BBCLASSEXTEND = "native nativesdk"