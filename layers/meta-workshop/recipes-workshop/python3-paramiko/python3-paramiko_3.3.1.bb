LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd0120fc2e9f841c73ac707a30389af5"

inherit pypi setuptools3
SRC_URI[sha256sum] = "6a3777a961ac86dbef375c5f5b8d50014a1a96d0fd7f054a43bc880134b0ff77"

PYPI_PACKAGE = "paramiko"
S = "${WORKDIR}/paramiko-3.3.1"