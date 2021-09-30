### Listing all ansible modules supported in your current version of Ansible
```
ansible-doc -l
```

### Finding total number of ansible modules supported
```
ansible-doc -l | wc -l
```

### Getting more details of any specific ansible module
```
ansible-doc apt
ansible-doc yum
ansible-doc file
ansible-doc service
ansible-doc command
ansible-doc copy
ansible-doc template
ansible-doc docker_image
ansible-doc docker_container
```

### Executing the install nginx playbook in Ubuntu and CentOS ansible nodes
```
cd ~/Training/devops-sep-2021
git pull
cd Day4/Ansible
ansible-playbook install-nginx-playbook.yml
```
