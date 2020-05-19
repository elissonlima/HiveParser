import setuptools

with open("README.md", "r") as fh:
    long_description = fh.read()

setuptools.setup(
    name="hiveparser", # Replace with your own username
    version="0.0.1",
    author="Elisson Lima",
    author_email="elissonlima0@gmail.com",
    description="Hive QL Parse to JSON",
    long_description=long_description,
    long_description_content_type="text/markdown",
    url="https://github.com/elissonlima/HiveParser",
    packages=setuptools.find_packages(),
    include_package_data=True,
    classifiers=[
        "Programming Language :: Python :: 3",
        "License :: OSI Approved :: MIT License",
        "Operating System :: Microsoft :: Windows :: Windows 10",
    ],
    python_requires='>=3.6',
)