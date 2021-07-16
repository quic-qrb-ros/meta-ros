# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This package defines services that are used to communicate with      the realtime control loop. It also defines messages      that represent the state of the realtime controllers, the joints      and the actuators."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Stuart Glaser <sglaser@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/pr2_mechanism_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_mechanism_msgs"
ROS_BPN = "pr2_mechanism_msgs"

ROS_BUILD_DEPENDS = " \
    actionlib-msgs \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib-msgs \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib-msgs \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/pr2_mechanism_msgs-release/archive/release/noetic/pr2_mechanism_msgs/1.8.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/pr2_mechanism_msgs"
SRC_URI = "git://github.com/ros-gbp/pr2_mechanism_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "b9ac68214d05bacbb8fe55ca2c82f52fc578b6ae"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
