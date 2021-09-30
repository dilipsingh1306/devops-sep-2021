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
2. Did you create Local Repository in JFrog Artifactory with name 'tektutor' ?
3. Are you sure you ran the 'mvn deploy' atleast once in Day1/CRM project?
4. See if your JFrog artifactory username and password are different from the ones used in the playbook
5. See if your JFrog artifactory container IP address is different than the one used in the URL

# DevOps
### Daily stand-up meeting
- is an inspect and adapt meeting
- fail-fast meeting

### Continuous Integration(CI)
- is fail-fast process
- the source is integrated with dev branch several times a day

### Continuous Deployment (CD)
- after the successful builds, the artifacts(bin) of the project will be deployed into JFrog Artifactory, etc.,
- deploying artifacts to QA environment for further automated testing

### Continuous Delivery (CD)
- is a highly matured level, wherin the binaries will automatically go live or will be deployed automatically
  to pre-prod or staging environment for further testing before it goes live
  
### What is DevOps?
- particular style of working
- end to end everything should be automated by converting every service into source code.
- team should be able to frequently make release to customer in a incremental fashion with confidence
- team should use tools and process to ensure the releases shared to the customer is of high-quality
- this requires everyone i.e Developers, QA and Operations Team converts their services into Code and they check-in
  their source code to version control.
- Which then will be picked up by Jenkins(CI) Server or similar CI Servers to trigger automated builds.
- As part of automated builds, dev, qa and pre-prod or staging environments will be provisioned automatically, your
  application will be built, binaries will be deployed to JFrog Artifactory or Sonatype Nexus and Dev environment for
  running automated Dev Testing(Unit & Integration Test)
- Once the automated test cases added by Dev Team works fine, then there should be a way to provision
  QA environment and developer certified binaries will be promoted for QA automated testing.
- Once the automated test cases added by QA Team works fine, then there should be a way to provision pre-prod environment automatically and promote the QA certified binaries to the pre-prod environment for further Production like test.

### What is Jenkins?
- Continuous Integration(CI) Build Server
- it was developed by Kohsuke Kawaguchi was a former Sun MicroSystem employed
- it was developed in Java
- however it can be used by a programming language stack
- it is a opensource CI Server
- Sun Microsystems was then acquired by Oracle led by Larry Ellison
- Originally it was called Hudson, the team got split into two, one half of the team stayed back in Oracle 
  and they continue to develop the tool as Hudson, while Kohsuke Kawaguchi and other like minded folks came out of
  Oracle and they continue to develop the tool as Jenkins.  
- Jenkins is a new branch created out of Hudson.
- Some alternates to Jenkins
  - Commercial version of Jenkins is called Cloudbees
  - Team City
  - Bamboo
  - Microsoft Team Foundataion Server (TFS)

### Downloading Jenkins
```
cd ~
wget https://get.jenkins.io/war-stable/2.303.1/jenkins.war
```

### Starting Jenkins from CLI
This will launch Jenkins in an interactive style, hence by mistake typing Ctrl + c will terminate Jenkins.
```
cd ~/Downloads
java -jar ./jenkins.war
```
In case you need terminal, you may create a new tab. Bottomline, don't stop jenkins by mistake :)
