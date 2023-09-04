FILESEXTRAPATHS:prepend := "${THISDIR}/systemd:"

SRC_URI += " \
    file://00-wired.network \
"

PACKAGECONFIG:append = " networkd"

do_install:append() {
    # The network files need to be in /usr/lib/systemd, not ${systemd_unitdir}...
    install -d ${D}${prefix}/lib/systemd/network/
    install -d ${D}/etc/systemd/network/
    install -m 0644 ${WORKDIR}/00-wired.network ${D}/etc/systemd/network/
}

FILES_${PN} += " \
    ${nonarch_base_libdir}/systemd/network \
"