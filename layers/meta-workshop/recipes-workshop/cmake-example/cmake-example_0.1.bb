# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
LICENSE = "CLOSED"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=d88e9e08385d2a17052dac348bde4bc1"

# SRC_URI = "git://github.com/tmdorner/cmake_example.git;protocol=https;branch=master"
SRC_URI = "https://github.com/tmdorner/cmake_example/archive/refs/tags/v0.1.1.tar.gz"
SRC_URI[sha256sum] = "c6828682fe078bcedf19145da124169b4413ffb36fd714aa533489f79cfb1258"

# Modify these as desired
# PV = "1.0+git${SRCPV}"
# SRCREV = "e0c7d2f4b8cc368466e1c862c94c2f2fa7bf0d0c"
# SRCREV = "${AUTOREV}"

S = "${WORKDIR}/cmake_example-0.1.1"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
# OECMAKE_GENERATOR = "Unix Makefiles"
EXTRA_OECMAKE = ""

