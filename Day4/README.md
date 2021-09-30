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
The expected output is
<pre>
[jegan@tektutor Ansible]$ <b>ansible-playbook install-nginx-playbook.yml</b>

PLAY [This playbook will install,configure and deploys custom web page into ansible nodes] *************************************************

TASK [Gathering Facts] *********************************************************************************************************************
ok: [ubuntu2]
ok: [ubuntu1]
ok: [centos2]
ok: [centos1]

TASK [include] *****************************************************************************************************************************
included: /home/jegan/Training/devops-sep-2021/Day4/Ansible/install-nginx-ubuntu.yml for ubuntu1, ubuntu2
included: /home/jegan/Training/devops-sep-2021/Day4/Ansible/install-nginx-centos.yml for centos2, centos1

TASK [Install nginx web server in Ubuntu nodes] ********************************************************************************************
ok: [ubuntu1]
ok: [ubuntu2]

TASK [Install curl in Ubuntu nodes] ********************************************************************************************************
ok: [ubuntu1]
ok: [ubuntu2]

TASK [Install Extra Packages for Enterprise Linux (EPEL) in CentOS nodes] ******************************************************************
ok: [centos2]
ok: [centos1]

TASK [Install nginx web server in CentOS nodes] ********************************************************************************************
ok: [centos1]
ok: [centos2]

TASK [include] *****************************************************************************************************************************
included: /home/jegan/Training/devops-sep-2021/Day4/Ansible/configure-nginx-ubuntu.yml for ubuntu1, ubuntu2
included: /home/jegan/Training/devops-sep-2021/Day4/Ansible/configure-nginx-centos.yml for centos1, centos2

TASK [Configure document root folder to force nginx use our custom folder in Ubuntu nodes] *************************************************
ok: [ubuntu1]
ok: [ubuntu2]

TASK [Configure document root folder to force nginx use our custom folder in CentOS nodes] *************************************************
ok: [centos1]
ok: [centos2]

TASK [Check if you are able to access nginx web page using curl] ***************************************************************************
[WARNING]: Consider using the get_url or uri module rather than running 'curl'.  If you need to use command because get_url or uri is
insufficient you can add 'warn: false' to this command task or set 'command_warnings=False' in ansible.cfg to get rid of this message.
changed: [ubuntu2]
changed: [ubuntu1]
changed: [centos2]
changed: [centos1]

TASK [Start nginx web server when curl fails] **********************************************************************************************
skipping: [ubuntu1]
skipping: [ubuntu2]
skipping: [centos1]
skipping: [centos2]

TASK [Create the custom document root folder] **********************************************************************************************
ok: [ubuntu2]
ok: [ubuntu1]
ok: [centos2]
ok: [centos1]

TASK [Reload the nginx configuration to apply changes] *************************************************************************************
changed: [ubuntu1]
changed: [ubuntu2]
changed: [centos1]
changed: [centos2]

TASK [Deploy custom web page into nginx web server] ****************************************************************************************
ok: [ubuntu1]
ok: [ubuntu2]
ok: [centos1]
ok: [centos2]

PLAY RECAP *********************************************************************************************************************************
centos1                    : ok=10   changed=2    unreachable=0    failed=0    skipped=1    rescued=0    ignored=0   
centos2                    : ok=10   changed=2    unreachable=0    failed=0    skipped=1    rescued=0    ignored=0   
ubuntu1                    : ok=10   changed=2    unreachable=0    failed=0    skipped=1    rescued=0    ignored=0   
ubuntu2                    : ok=10   changed=2    unreachable=0    failed=0    skipped=1    rescued=0    ignored=0
</pre>

### Running the playbook that downloads jars from JFrog Artifactory
```
cd ~/Training/devops-sep-2021
git pull
cd Day4/Ansible
ansible-playbook fetch-artifacts-from-artifactory-playbook.yml
```
The expected output is
<pre>
[jegan@tektutor Ansible]$ <b>ansible-playbook fetch-artifacts-from-artifactory-playbook.yml</b>

PLAY [This playbook demonstrates downloading artifacts from JFrog Artifactory] ******************************************

TASK [Gathering Facts] **************************************************************************************************
ok: [localhost]

TASK [Download artifacts from JFrog Artifactory] ************************************************************************
ok: [localhost] => (item=http://172.17.0.6:8082/ui/native/tektutor/org/tektutor/frontend/1.0.0/frontend-1.0.0.jar)
ok: [localhost] => (item=http://172.17.0.6:8082/ui/native/tektutor/org/tektutor/businesslayer/1.0.0/businesslayer-1.0.0.jar)
ok: [localhost] => (item=http://172.17.0.6:8082/ui/native/tektutor/org/tektutor/backend/1.0.0/backend-1.0.0.jar)
ok: [localhost] => (item=http://172.17.0.6:8082/artifactory/tektutor/org/tektutor/main/1.0.0/main-1.0.0.jar)

PLAY RECAP **************************************************************************************************************
localhost                  : ok=2    changed=0    unreachable=0    failed=0    skipped=0    rescued=0    ignored=0   
</pre>

##### Troubleshooting
In case the above playbook fails to download, you may have to look into the below 
1. See if your JFrog artifactory container is running
2. Are you sure you ran the 'mvn deploy' atlease once in Day1/CRM project?
3. See if your JFrog artifactory username and password are different from the ones used in the playbook
4. See if your JFrog artifactory container IP address is different than the one used in the URL
