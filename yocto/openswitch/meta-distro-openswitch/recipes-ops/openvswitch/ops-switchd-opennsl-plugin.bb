SUMMARY = "OpenSwitch vswitchd Broadcom plugin"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = "ops-ovsdb virtual/opennsl ops-switchd ops-supportability ops-classifierd"

PROVIDES += "virtual/ops-switchd-switch-api-plugin"
RPROVIDES_${PN} += "virtual/ops-switchd-switch-api-plugin"

SRC_URI = "git://git.openswitch.net/openswitch/ops-switchd-opennsl-plugin;protocol=http;branch=rel/dill"

FILES_${PN} = "${libdir}/openvswitch/plugins"

SRCREV = "47a5aa10621fb629869214dced385bb1ed94bb24"

# When using AUTOREV, we need to force the package version to the revision of git
# in order to avoid stale shared states.
PV = "git${SRCPV}"

S = "${WORKDIR}/git"

inherit openswitch cmake
