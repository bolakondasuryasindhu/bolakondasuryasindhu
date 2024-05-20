import math

class Geometry:
    def area(self, length: float, width: float = None) -> float:
        if width is None:
            # When width is not provided, assume it is calculating the area of a circle
            radius = length
            return math.pi * radius * radius
        else:
            # When both length and width are provided, calculate the area of a rectangle
            return length * width

    def volume(self, length: float, width: float, height: float) -> float:
        return length * width * height

# Demonstrate the usage of the Geometry class

# Create an instance of the Geometry class
geometry = Geometry()

# Calculate the area of a rectangle
length = 5.0
width = 3.0
rectangle_area = geometry.area(length, width)
print(f"Area of the rectangle with length {length} and width {width}: {rectangle_area}")

# Calculate the area of a circle
radius = 4.0
circle_area = geometry.area(radius)
print(f"Area of the circle with radius {radius}: {circle_area}")

# Calculate the volume of a box
length = 5.0
width = 3.0
height = 2.0
box_volume = geometry.volume(length, width, height)
print(f"Volume of the box with length {length}, width {width}, and height {height}: {box_volume}")
______________________________________________________________________________________________________________________________________________________________________________________________________
OUTPUTS
Area of the rectangle with length 5.0 and width 3.0: 15.0
Area of the circle with radius 4.0: 50.26548245743669
Volume of the box with length 5.0, width 3.0, and height 2.0: 30.0

