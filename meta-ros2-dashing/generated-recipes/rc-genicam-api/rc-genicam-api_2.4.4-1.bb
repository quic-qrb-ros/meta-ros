# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "GenICam/GigE Vision Convenience Layer.        This package combines the Roboception convenience layer for images with the       GenICam reference implementation and a GigE Vision transport layer. It is a       self contained package that permits configuration and image streaming of       GenICam / GigE Vision 2.0 compatible cameras like the Roboception rc_visard.        This package also provides some tools that can be called from the command line       for discovering cameras, changing their configuration and streaming images.       Although the tools are meant to be useful when working in a shell or in a       script, their main purpose is to serve as example on how to use the API for       reading and setting parameters, streaming and synchronizing images.        See LICENSE.md for licensing terms of the different parts."
AUTHOR = "Felix Ruess <felix.ruess@roboception.de>"
ROS_AUTHOR = "Heiko Hirschmueller <heiko.hirschmueller@roboception.de>"
HOMEPAGE = "http://wiki.ros.org/rc_genicam_api"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=27;endline=27;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "rc_genicam_api"
ROS_BPN = "rc_genicam_api"

ROS_BUILD_DEPENDS = " \
    libpng \
    libusb1 \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    libpng \
    libusb1 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libpng \
    libusb1 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/roboception-gbp/rc_genicam_api-release/archive/release/dashing/rc_genicam_api/2.4.4-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/rc_genicam_api"
SRC_URI = "git://github.com/roboception-gbp/rc_genicam_api-release;${ROS_BRANCH};protocol=https"
SRCREV = "d90526de33f67883e976b9249946093a950dc214"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
