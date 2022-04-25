# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Layer encapsulating ROS middleware to allow rosbag2 to be used with or without middleware"
AUTHOR = "Geoffrey Biggs <geoff@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosbag2"
ROS_BPN = "rosbag2_transport"

ROS_BUILD_DEPENDS = " \
    keyboard-handler \
    rclcpp \
    rmw \
    rosbag2-compression \
    rosbag2-cpp \
    rosbag2-interfaces \
    rosbag2-storage \
    shared-queues-vendor \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    keyboard-handler \
    rclcpp \
    rmw \
    rosbag2-compression \
    rosbag2-cpp \
    rosbag2-interfaces \
    rosbag2-storage \
    shared-queues-vendor \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    keyboard-handler \
    rclcpp \
    rmw \
    rosbag2-compression \
    rosbag2-cpp \
    rosbag2-interfaces \
    rosbag2-storage \
    shared-queues-vendor \
    yaml-cpp-vendor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-index-cpp \
    ament-lint-auto \
    ament-lint-common \
    rmw-implementation-cmake \
    rosbag2-compression-zstd \
    rosbag2-test-common \
    test-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosbag2-release/archive/release/humble/rosbag2_transport/0.15.1-2.tar.gz
ROS_BRANCH ?= "branch=release/humble/rosbag2_transport"
SRC_URI = "git://github.com/ros2-gbp/rosbag2-release;${ROS_BRANCH};protocol=https"
SRCREV = "77e3eb6181d40fee47ad82d3f3cc8b9634b661ee"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
