# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "ROS2 custom interface examples using ROBOTIS DYNAMIXEL SDK"
AUTHOR = "willson <willson@robotis.com>"
ROS_AUTHOR = "Will Son <willson@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/dynamixel_sdk"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "dynamixel_sdk"
ROS_BPN = "dynamixel_sdk_custom_interfaces"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/robotis-ros2-release/dynamixel_sdk-release/archive/release/rolling/dynamixel_sdk_custom_interfaces/3.7.40-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/dynamixel_sdk_custom_interfaces"
SRC_URI = "git://github.com/robotis-ros2-release/dynamixel_sdk-release;${ROS_BRANCH};protocol=https"
SRCREV = "27d03833eb7607f20ca22a065e4587bc475bff37"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
