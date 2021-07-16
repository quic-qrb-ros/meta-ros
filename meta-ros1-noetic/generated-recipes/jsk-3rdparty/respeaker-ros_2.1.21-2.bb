# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The respeaker_ros package"
AUTHOR = "Yuki Furuta <furushchev@jsk.imi.i.u-tokyo.ac.jp>"
ROS_AUTHOR = "Yuki Furuta <furushchev@jsk.imi.i.u-tokyo.ac.jp>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=211ba54883815de9f52a3dcd9f281523"

ROS_CN = "jsk_3rdparty"
ROS_BPN = "respeaker_ros"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python-pixel-ring-pip} \
    ${ROS_UNRESOLVED_DEP-python-pyusb-pip} \
    ${ROS_UNRESOLVED_DEP-python-speechrecognition-pip} \
    angles \
    audio-common-msgs \
    dynamic-reconfigure \
    flac \
    geometry-msgs \
    std-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    jsk-tools \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_3rdparty-release/archive/release/noetic/respeaker_ros/2.1.21-2.tar.gz
ROS_BRANCH ?= "branch=release/noetic/respeaker_ros"
SRC_URI = "git://github.com/tork-a/jsk_3rdparty-release;${ROS_BRANCH};protocol=https"
SRCREV = "027f777f04721445e9c0b72be4c40fe6bb6d7a8e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
