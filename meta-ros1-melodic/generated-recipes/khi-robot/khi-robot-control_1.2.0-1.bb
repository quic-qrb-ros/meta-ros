# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "ROS KHI robot controller package based on ros_control"
AUTHOR = "nakamichi_d <nakamichi_d@khi.co.jp>"
ROS_AUTHOR = "nakamichi_d <nakamichi_d@khi.co.jp>"
HOMEPAGE = "http://ros.org/wiki/khi_robot"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "khi_robot"
ROS_BPN = "khi_robot_control"

ROS_BUILD_DEPENDS = " \
    controller-manager \
    diagnostic-updater \
    hardware-interface \
    joint-limits-interface \
    khi-robot-msgs \
    realtime-tools \
    trajectory-msgs \
    transmission-interface \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-manager \
    diagnostic-updater \
    hardware-interface \
    joint-limits-interface \
    joint-state-controller \
    joint-trajectory-controller \
    khi-robot-msgs \
    position-controllers \
    trajectory-msgs \
    transmission-interface \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-manager \
    diagnostic-updater \
    hardware-interface \
    joint-limits-interface \
    joint-state-controller \
    joint-trajectory-controller \
    khi-robot-msgs \
    position-controllers \
    trajectory-msgs \
    transmission-interface \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/Kawasaki-Robotics/khi_robot-release/archive/release/melodic/khi_robot_control/1.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/khi_robot_control"
SRC_URI = "git://github.com/Kawasaki-Robotics/khi_robot-release;${ROS_BRANCH};protocol=https"
SRCREV = "bf55e505bab025b82a4a3ad704b93ca67f84b06f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
