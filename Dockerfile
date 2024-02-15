# Use a lightweight base image
FROM nginx:alpine

# Set the working directory in the container
WORKDIR /usr/share/nginx/html

# Copy the HTML file to the container
COPY index.html .

# Expose port 80
EXPOSE 80

# Command to run the web server
CMD ["nginx", "-g", "daemon off;"]